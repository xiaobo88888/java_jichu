package Lei_neibu;

/*匿名内部类：
      前提：存在一个类或者接口，这个类可以是抽象类，也可以是具体类
*     格式：new 类名或者接口名(){  //前提中的类或接口和new 类名的类或接口是一致的
*             重写方法
*          }; //注意这里有个分号，因为这可以看作是对象，而A a = new A(); 这里也有个分号
*     例：new Inter(){
*             public void show(){
*             }
*         }
     因为存在重写方法，所以继承了一个类或者是实现了一个接口
     而又因为是new出来的所以匿名内部类是一个对象，只是这个对象没有名字
 本质：是一个继承了该类或者是实现了该接口的子类的匿名对象

 所以可以采用多态的方式创建对象名，匿名内部类相当于前提类的接口的实现类或者子类
 */
public class Outer_niming {
    public void method(){
        //这样子只是new出来个对象，但是并没有调用方法
       /*
       new Inter_niming(){
            @Override
            public void show(){
                System.out.println("匿名内部");
            }
        };
        */
//        show();
         new Inter_niming(){
            @Override
            public void show(){
                System.out.println("匿名内部");
            }
        }.show();//这样子就调用了方法了，通过对象调用

        //多次调用方法
        /*new Inter_niming(){
            @Override
            public void show(){
                System.out.println("匿名内部");
            }
        }.show();

        new Inter_niming(){
            @Override
            public void show(){
                System.out.println("匿名内部");
            }
        }.show();*/
        //这样子多次调用太麻烦了
        /*
       new Inter_niming(){
            @Override
            public void show(){
                System.out.println("匿名内部");
            }
        };
        */
        //在这里Inter_niming是个类，而后面的
//        {
//            @Override
//            public void show(){
//            System.out.println("匿名内部");
//        }
//      代码块重写了Inter_niming的方法，所以这个相当于类的子类或者接口的实现类
//        所以这里就可以采用多态的形式创建对象
       Inter_niming i = new Inter_niming(){
            @Override
            public void show(){
                System.out.println("匿名内部");
            }
        };//多态方式创建对象
        i.show();
        i.show();//这里就可以通过对象名调用方法
    }
}
