public class MyService2
{
    public void doA()
    {
        String url = "";
        Object client;

        new AbstractDoRunner<DataB>(){

            @Override
            public void myRun() {
                super.myRun();


                //logout();

            }

            @Override
            public void beforeRunService() {
//                GraphQLclient = new Client(url);
            }

            @Override
            public String getResponse() {

                String client = "client.Execute(url)";

                String myResponse = "Json.Convert(client.Content)";

                return myResponse;

            }

            @Override
            public void logRawData(String rawData) {
                super.logRawData(rawData);
                System.out.println("MyService2.logRawData");
            }

            @Override
            public void afterExecution(String response) {

            }

            @Override
            public DataB convertResponse(String response) {
                return null;
            }

            @Override
            public void afterRunService() {

            }
        }.myRun();
    }

    public void doB() {

        new AbstractDoRunner<DataB>(){

            @Override
            public void beforeRunService() {

            }

            @Override
            public String getResponse() {
                return null;
            }

            @Override
            public void afterExecution(String response) {

            }

            @Override
            public DataB convertResponse(String response) {
                return null;
            }

            @Override
            public void afterRunService() {

            }
        }.myRun();

    }

    public void doC() {

        // Client cleint = new Client()
        // Token

        //....

        //
    }
}