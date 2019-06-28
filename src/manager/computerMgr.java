package manager;

import java.util.Scanner;

import computer.Computer;
import computer.Notebook;
import computer.Desktop;

public class computerMgr {
    private Computer[] computers = new Computer[50];
    private int cnt = 0;

    public computerMgr() {

    }

    public computerMgr(Computer[] computers) {
        this.computers = computers;
    }

    public void initial() {
        computers[0] = new Notebook("T61", "IBM", "Intel���2", "2GB", "160GB", "14.1Ӣ��", "6о");
        computers[1] = new Notebook("X60", "IBM", "Intel���2", "512MB", "60GB", "12.1Ӣ��", "6о");
        computers[2] = new Desktop("530MT", "����", "Intel���2", "512MB", "80GB", "19Ӣ��", "��ʽ");
        computers[3] = new Desktop("Lenovo5050", "����", "AMD����64", "1GB", "160GB", "22Ӣ��", "��ʽ");
        computers[4] = new Notebook("u4000", "��˶", "���i5", "4GB", "160GB", "14Ӣ��", "9о");
        computers[5] = new Desktop("Lenovo����", "����", "���i5", "8GB", "1TB", "22Ӣ��", "��ʽ");
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
    
    private boolean delete(int n) {
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
