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
    public void startMenu(){
             System.out.println("\t\t��ӭ���Թ���ϵͳ");
             System.out.println("-------------------------------------");
             System.out.println("��ѡ���û�������1���鿴������Ϣ\t2:���ӵ�����Ϣ\t3:ɾ��������Ϣ\t4:�˳�");     
             System.out.print("��ѡ�� ");
             
             Scanner input = new Scanner(System.in);
             int choice = input.nextInt();
             
             switch(choice){
                case 1://check
                    list();
                    returnMain();
                    break;
                case 2://add
                    System.out.println("\nлл ʹ �ã�");
                    break;
                case 3://delete
                    break;
                case 4://quit
                    
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
     * ������а�
     */
    public String[] list() {
        // ���������飬������������ͼ����Ϣ
        String[] newname = new String[50];
        int[] newcount = new int[50];

        for (int k = 0; k < book.name.length; k++) {
            newname[k] = book.name[k];
            newcount[k] = book.count[k];
        }

        // ����ð�������㷨��������
        for (int i = 0; i < newname.length; i++) {
            for (int j = i + 1; j < newname.length; j++) {
                if (newcount[i] > newcount[j]) {
                    // TODO ͨ������������˳����
                    int t = newcount[i];
                    newcount[i] = newcount[j];
                    newcount[j] = t;
                    String st = newname[i];
                    newname[i] = newname[j];
                    newname[j] = st;

                }
            }
        }
        System.out.println("---> ���а�\n");
        System.out.println("**************************");
        System.out.println("����\t����");
        // ��ʾ���а���Ϣ
        for (int i = newname.length - 1; i >= 0; i--) {
            if (newname[i] != null) {
                System.out.println(newcount[i] + "\t<<" + newname[i] + ">>");
            }
        }
        System.out.println("**************************");
        // returnMain();
        return newname;
    }
}
