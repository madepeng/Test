package com.test.producerandconsumer;

//Demo1.java
//仓库
class Depot {
 private int capacity;    // 仓库的容量
 private int size;        // 仓库的实际数量

 public Depot(int capacity) {
     this.capacity = capacity;
     this.size = 0;
 }
 
 public synchronized void produce(int val) {
     try {
          // left 表示“想要生产的数量”(有可能生产量太多，需多此生产)
         int stillProduceNum = val;
         while (stillProduceNum > 0) {
             // 库存已满时，等待“消费者”消费产品。
             while (size >= capacity)
                 wait();
             // 获取“实际生产的数量”(即库存中新增的数量)
             // 如果“库存”+“想要生产的数量”>“总的容量”，则“实际增量”=“总的容量”-“当前容量”。(此时填满仓库)
             // 否则“实际增量”=“想要生产的数量”
             int actualProduceNum = (size+stillProduceNum)>capacity ? (capacity-size) : stillProduceNum;
             size += actualProduceNum;
             stillProduceNum -= actualProduceNum;
             System.out.printf("%s produce(%3d) --> left=%3d, inc=%3d, size=%3d\n", 
                     Thread.currentThread().getName(), val, stillProduceNum, actualProduceNum, size);
             // 通知“消费者”可以消费了。
             notifyAll();
         }
     } catch (InterruptedException e) {
     }
 } 

 public synchronized void consume(int val) {
     try {
         // left 表示“客户要消费数量”(有可能消费量太大，库存不够，需多此消费)
         int stillProduceNum = val;
         while (stillProduceNum > 0) {
             // 库存为0时，等待“生产者”生产产品。
             while (size <= 0)
                 wait();
             // 获取“实际消费的数量”(即库存中实际减少的数量)
             // 如果“库存”<“客户要消费的数量”，则“实际消费量”=“库存”；
             // 否则，“实际消费量”=“客户要消费的数量”。
             int actualConsumeNum = (size<stillProduceNum) ? size : stillProduceNum;
             size -= actualConsumeNum;
             stillProduceNum -= actualConsumeNum;
             System.out.printf("%s consume(%3d) <-- left=%3d, dec=%3d, size=%3d\n", 
                     Thread.currentThread().getName(), val, stillProduceNum, actualConsumeNum, size);
             notifyAll();
         }
     } catch (InterruptedException e) {
     }
 }

 public String toString() {
     return "capacity:"+capacity+", actual size:"+size;
 }
} 




