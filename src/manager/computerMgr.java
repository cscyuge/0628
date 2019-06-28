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
<<<<<<< HEAD
        computers[0] = new Notebook("T61", "IBM", "Intel酷睿2", "2GB", "160GB", "14.1英寸", "6芯");
        computers[1] = new Notebook("X60", "IBM", "Intel酷睿2", "512MB", "60GB", "12.1英寸", "6芯");
        computers[2] = new Desktop("530MT", "戴尔", "Intel酷睿2", "512MB", "80GB", "19英寸", "卧式");
        computers[3] = new Desktop("Lenovo5050", "联想", "AMD速龙64", "1GB", "160GB", "22英寸", "立式");
        computers[4] = new Notebook("u4000", "华硕", "酷睿i5", "4GB", "160GB", "14英寸", "9芯");
        computers[5] = new Desktop("Lenovo天逸", "联想", "酷睿i5", "8GB", "1TB", "22英寸", "立式");
=======
>>>>>>> ed80512adfb02283b5eb1ee5eeec239807aeec5a
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

<<<<<<< HEAD
    /**
     * 
     */
    public void show() {
    }
    
    private boolean delete(int n) {
        if (n >= cnt) {
            System.out.println("不存在，请重新输入！");
            return false;
        }
        for (int i = n; i < cnt - 1; ++i) computers[i] = computers[i + 1];
        --cnt;
        System.out.println("删除成功！");
        return true;
    }
    
    public void delete() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("请输入删除序号:");
            n = sc.nextInt();
        } while (!delete(n));
=======
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
>>>>>>> ed80512adfb02283b5eb1ee5eeec239807aeec5a
    }
    
    
}
