package service;

import java.util.Scanner;

/**
 * @author caiwh
 * @date 2022/6/28
 * @Description
 */
public class BuyFruits {

    int number;
    int apple = 8;
    int strawberry = 13;
    int mano = 20;

    public int A(){
        System.out.println("请输入您需要的苹果斤数");
        Scanner scanner = new Scanner(System.in);
        int aWeight = scanner.nextInt();
        System.out.println("请输入您需要的草莓斤数");
        int sWeight = scanner.nextInt();
        number = (aWeight*apple)+(sWeight*strawberry);
        return verify(aWeight,sWeight,0,0.0,number);
    }

    public int B(){
        System.out.println("请输入您需要的苹果斤数");
        Scanner scanner = new Scanner(System.in);
        int aWeight = scanner.nextInt();
        System.out.println("请输入您需要的草莓斤数");
        int sWeight = scanner.nextInt();
        System.out.println("请输入您需要的芒果斤数");
        int mWeight = scanner.nextInt();
        number = (aWeight*apple)+(sWeight*strawberry)+(mWeight*mano);
        return verify(aWeight,sWeight,mWeight,0.0,number);
    }

    public int c(){
        double sDiscount = 0.8;
        System.out.println("请输入您需要的苹果斤数");
        Scanner scanner = new Scanner(System.in);
        int aWeight = scanner.nextInt();
        System.out.println("请输入您需要的草莓斤数");
        int sWeight = scanner.nextInt();
        System.out.println("请输入您需要的芒果斤数");
        int mWeight = scanner.nextInt();
        number = (int)((aWeight*apple)+(sWeight*strawberry*sDiscount)+(mWeight*mano));
        return verify(aWeight,sWeight,mWeight,sDiscount,number);
    }

    public int d(){
        double sDiscount = 0.8;
        System.out.println("请输入您需要的苹果斤数");
        Scanner scanner = new Scanner(System.in);
        int aWeight = scanner.nextInt();
        System.out.println("请输入您需要的草莓斤数");
        int sWeight = scanner.nextInt();
        System.out.println("请输入您需要的芒果斤数");
        int mWeight = scanner.nextInt();
        number = (int)((aWeight*apple)+(sWeight*strawberry*sDiscount)+(mWeight*mano));
        if (number >= 100) {number = number - 10;}
        return verify(aWeight,sWeight,mWeight,sDiscount,number);
    }

    public int verify(int aWeight,int sWeight,int mWeight,double sDiscount,int num){
        int total = (int)((aWeight*apple)+(sWeight*strawberry*sDiscount)+(mWeight*mano));
        if (total == num){
            return total;
        } else {
            throw new RuntimeException("计算错误");
        }
    }

}
