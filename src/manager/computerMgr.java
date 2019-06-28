package manager;

import java.util.Scanner;

import computer.Computer;

public class computerMgr {
    private Computer[] computers = new Computer[50];
    private int cnt = 0;

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
    public void startMenu() {
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

            break;
        default:
            System.out.println("������������������");
        }

    }

    /**
     * �������˵�
     */
    public void returnMain() {
        Scanner input = new Scanner(System.in);
        System.out.print("����0���أ�");
        if (input.nextInt() == 0) {
            startMenu();
        } else {
            System.out.println("�������, �쳣��ֹ��");
        }
    }

    /**
     * 
     */
    public void show() {
    }
    
    public boolean delete(int n) {
        if (n >= cnt) {
            System.out.println("�����ڣ����������룡");
            return false;
        }
        for (int i = n; i < cnt - 1; ++i) computers[i] = computers[i + 1];
        --cnt;
        System.out.println("ɾ���ɹ���");
        return true;
    }
    
    public void delete() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("������ɾ�����:");
            n = sc.nextInt();
        } while (!delete(n));
    }
}
