package manager;

public class computerMgr {

    /**
     * ����ͼ�����
     */
    BookSet book = new BookSet();
    /**
     * ��ʼ����ͼ��    
     */
    public void initial() {
        
        book.name[0] = "���ݽṹ";
        book.state[0] = 0; 
        book.date[0]="2018-7-1";
        book.count[0]=15;
        
        book.name[1] = "���ݿ�";
        book.state[1] = 1;
        book.count[1]=12;
        
        book.name[2] = "��ɢ��ѧ";
        book.state[2] = 1;
        book.count[2]=30;
        
        book.name[3] = "���������";
        book.state[3] = 1;
        book.count[3]=2;
    }   
    /**
     * ��ʼ�˵�
     */
    public void startMenu(){
         System.out.println("��ӭʹ��ͼ�����ϵͳ");
         System.out.println("-------------------------------------");
         System.out.println("0. ������а�");     
         System.out.println("1. ��         �� ");
         
         System.out.print("--------------------------------------\n");
    
         System.out.print("��ѡ�� ");
         Scanner input = new Scanner(System.in);
         int choice = input.nextInt();
         switch(choice){
            case 0://������а�
                list();
                returnMain();
                break;
            case 1://�˳�
                System.out.println("\nлл ʹ �ã�");
                break;
         }
    }
    /**
     * �������˵�
     */
    public void returnMain(){
     Scanner input = new Scanner(System.in); 
     System.out.print("����0���أ�");
        if(input.nextInt() == 0){
         startMenu();
        }else{
         System.out.println("�������, �쳣��ֹ��");
        }
    }
 
    /**
     * ������а�
     */
    public String[] list(){
        //���������飬������������ͼ����Ϣ
        String[] newname = new String[50];      
        int[] newcount=new int[50]; 

        for(int k=0;k<book.name .length;k++){
             newname[k]=book.name[k];
             newcount[k]=book.count[k];
        }
            
        //����ð�������㷨��������
        for(int i=0;i<newname.length;i++){
            for(int j=i+1;j<newname.length;j++){
                if(newcount[i]>newcount[j]){
                    //TODO ͨ������������˳����
                    int t=newcount[i];
                    newcount[i]=newcount[j];
                    newcount[j]=t;
                    String st=newname[i];
                    newname[i]=newname[j];
                    newname[j]=st;
                    
                }               
            }           
        }
        System.out.println("---> ���а�\n");
        System.out.println("**************************");
        System.out.println("����\t����");
        //��ʾ���а���Ϣ
        for(int i=newname.length-1;i>=0;i--){
            if(newname[i]!=null){
                System.out.println(newcount[i]+"\t<<"+ newname[i]+ ">>" );
            }
        }
         System.out.println("**************************");
         //returnMain();
         return newname;
       }
}
