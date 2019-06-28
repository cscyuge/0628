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
     * 开始菜单
     */
    public boolean startMenu() {
        System.out.println("\t\t欢迎电脑管理系统");
        System.out.println("-------------------------------------");
        System.out.println("请选择用户操作：1：查看电脑信息\t2:增加电脑信息\t3:删除电脑信息\t4:退出");
        System.out.print("请选择： ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
        case 1:// show
            show();
            returnMain();
            break;
        case 2:// add
            System.out.println("\n谢谢 使 用！");
            break;
        case 3:// delete
            break;
        case 4:// quit
            return true;
        default:
            System.out.println("输入有误，请重新输入");
        }
        return false;

    }

    /**
     * 返回主菜单
     */
    public void returnMain() {
        Scanner input = new Scanner(System.in);
        System.out.print("输入0返回：");
        while (input.nextInt() != 0) {
            System.out.println("无效输入！");
        }
    }

    public void show() {
        System.out.println("序号\t\t型号名称\t\t品牌\tCPU\t内存\t硬盘\t显示器\t电池芯片\t机箱类型");
        for (int i=0;i<computers.length;i++) {
            System.out.print(i+1+"\t\t");
            computers[i].printInfo();
        }
        System.out.println("请输入所选序号：");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if (id>=1&&id<=computers.length) {
            System.out.println("您选择的电脑具体信息如下");
            System.out.println("序号\t\t型号名称\t\t品牌\tCPU\t内存\t硬盘\t显示器\t电池芯片\t机箱类型");
            computers[id-1].printInfo();
        }else {
            System.out.println("序号有误！");
        }
    }
    
    
}
