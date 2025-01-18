public class Application {
    public static void main(String[] args) {

        IDatabase connection1 = new OracleSql();
        IDatabase connection2 = new PostgresSql();


        connection1.objectName();
        connection2.objectName();

        boolean connection_config = false;

        if(connection_config == true ){

            connection1 = connection2;

        }
        else
        {
            connection1 = connection1;

        }

        connection1.objectName();
        connection1.tableName();

        System.out.println("--------------------------------");

        Operation_system obj0 = new Operation_system();

        obj0 = new Linux();
        obj0.getcpustatus();//Run time Polymorphism

        obj0 = new Windows();
        obj0.getcpustatus();//Run time Polymorphism



        Operation_system obj1 = new Linux();
        obj1.getcpustatus();//since this has method overloading, therefore it will refer the object Linux




        Operation_system obj2 = new Windows();
        //obj2.getcmdStatus();




    }
}
