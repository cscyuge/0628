package manager;

import java.util.Scanner;

import computer.Computer;

public class computerMgr {
    Computer[] computers = new Computer[50];

    public computerMgr() {

    }

    public computerMgr(Computer[] computers) {
        this.computers = computers;
    }

    public void initial() {
    }

    /**
     * ��ʼ�˵�
     */
    public boolean startMenu() {
        System.out.println("\t\t��ӭ���Թ���ϵͳ");
        System.out.println("-------------------------------------");
        System.out.println("��ѡ���û�������1���鿴������Ϣ\t2:���ӵ�����Ϣ\t3:ɾ��������Ϣ\t4:�˳�");
        System.out.print("��ѡ�� ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
        case 1:// show
            show();
            returnMain();
            break;
        case 2:// add
            System.out.println("\nлл ʹ �ã�");
            break;
        case 3:// delete
            break;
        case 4:// quit
            return true;
        default:
            System.out.println("������������������");
        }
        return false;

    }

    /**
     * �������˵�
     */
    public void returnMain() {
        Scanner input = new Scanner(System.in);
        System.out.print("����0���أ�");
        while (input.nextInt() != 0) {
            System.out.println("��Ч���룡");
        }
    }

    public void show() {
        System.out.println("���\t\t�ͺ�����\t\tƷ��\tCPU\t�ڴ�\tӲ��\t��ʾ��\t���оƬ\t��������");
        for (int i=0;i<computers.length;i++) {
            System.out.print(i+1+"\t\t");
            computers[i].printInfo();
        }
        System.out.println("��������ѡ��ţ�");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if (id>=1&&id<=computers.length) {
            System.out.println("��ѡ��ĵ��Ծ�����Ϣ����");
            System.out.println("���\t\t�ͺ�����\t\tƷ��\tCPU\t�ڴ�\tӲ��\t��ʾ��\t���оƬ\t��������");
            computers[id-1].printInfo();
        }else {
            System.out.println("�������");
        }
    }
    
    
}
