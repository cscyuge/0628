package manager;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import computer.Computer;
import computer.Desktop;
import computer.Notebook;

public class computerMgr {
    Computer[] computers = new Computer[50];
    private int cnt=0;

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
        cnt=6;
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
            add();
            break;
        case 3:// delete
            delete();
            break;
        case 4:// quit
            System.out.println("\nлл ʹ �ã�");
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
            if (computers[i] == null) break;
            System.out.print(i+1+"\t\t");
            computers[i].printInfo();
        }
        System.out.println("��������ѡ��ţ�");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if (id>=0&&id<computers.length&&computers[id-1]!=null) {
            System.out.println("��ѡ��ĵ��Ծ�����Ϣ����");
            System.out.println("���\t\t�ͺ�����\t\tƷ��\tCPU\t�ڴ�\tӲ��\t��ʾ��\t���оƬ\t��������");
            computers[id-1].printInfo();
        }else {
            System.out.println("�������");
        }
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
    
    
    
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("��ѡ��������ͣ�");
        
    }
}
