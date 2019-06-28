package manager;

import java.util.Scanner;

import computer.Computer;
import computer.Notebook;
import computer.Desktop;

public class computerMgr {
    private Computer[] computers = new Computer[7];
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
        cnt = 6;
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
            showSingleComputer();
            break;
        case 2:// add
            add();
            show();
            break;
        case 3:// delete
            delete();
            break;
        case 4:// quit
            System.out.println("\nллʹ�ã�");
            return true;
        default:
            System.out.println("������������������");
        }
        return false;

    }

    public void add() {
        if (cnt >= computers.length) {
            Computer[] new_arr = new Computer[computers.length << 1];
            for (int i = 0; i < cnt; ++i) new_arr[i] = computers[i];
            computers = new_arr;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("��ѡ��������ͣ�1���ʼǱ� \t2��̨ʽ��");
        int type;
        while (true) {
            type = sc.nextInt();
            if (type == 1 || type == 2) break;
            else System.out.println("���������룡");
        }
        System.out.print("�������ͺ����ƣ�");
        String name = sc.next();
        System.out.print("������Ʒ�����ƣ�");
        String brand = sc.next();
        System.out.print("������CPU��");
        String CPU = sc.next();
        System.out.print("�������ڴ棺");
        String memory = sc.next();
        System.out.print("������Ӳ�̣�");
        String disk = sc.next();
        System.out.print("��������ʾ���ߴ磺");
        String monitor = sc.next();
        if (type == 1) {
            System.out.print("���оƬ��");
            String battery = sc.next();
            computers[cnt++] = new Notebook(name, brand, CPU, memory, disk, monitor, battery);
        } else if (type == 2) {
            System.out.println("��ѡ��������ͣ�1����ʽ\t2����ʽ");
            int hosttype;
            do {
                hosttype = sc.nextInt();
            } while (hosttype != 1 && hosttype != 2);
            String type1;
            switch (hosttype) {
            case 1:
                type1 = "��ʽ";
                break;
            case 2:
                type1 = "��ʽ";
                break;
            default:
                type1 = null;
                System.err.println("SYSTEM ERROR");
            }
            computers[cnt++] = new Desktop(name, brand, CPU, memory, disk, monitor, type1);
        } else {
            System.err.println("SYSTEM ERROR");
        }
        System.out.println("��ӳɹ�����ǰ������Ϣ����:");
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
    
    private boolean delete(int n) {
        --n;
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

    public void show() {
        System.out.println("���\t\t�ͺ�����\t\tƷ��\t\tCPU\t\t�ڴ�\t\tӲ��\t\t��ʾ��\t\t���оƬ\t\t��������");
        for (int i = 0; i < cnt; i++) {
            System.out.print(i + 1 + "\t\t");
            computers[i].printInfo(true);
        }
    }
    
    public void showSingleComputer() {
        System.out.println("��������ѡ��ţ�");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if (id >= 1 && id <= cnt) {
            System.out.println("��ѡ��ĵ��Ծ�����Ϣ����");
            if (computers[id - 1] instanceof Notebook) {
                System.out.println("�ͺ�����\t\tƷ��\t\tCPU\t\t�ڴ�\t\tӲ��\t\t��ʾ��\t\t���оƬ");
                computers[id - 1].printInfo(false);
            } else if (computers[id - 1] instanceof Desktop) {
                System.out.println("�ͺ�����\t\tƷ��\t\tCPU\t\t�ڴ�\t\tӲ��\t\t��ʾ��\t\t��������");
                computers[id - 1].printInfo(false);
            } else {
                System.err.println("SYSTEM ERROR");
            }
        } else {
            System.out.println("�������");
        }
    }
}
