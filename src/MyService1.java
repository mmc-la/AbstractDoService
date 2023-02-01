public class MyService1
{
    public void doA()
    {
        String url = "";
        Object client;

        new AbstractDoRunner<DataA>(){

            @Override
            public void beforeRunService() {
//                client = new Client(url);
//                token = ""
            }

            @Override
            public String getResponse() {
                return null;
            }

            @Override
            public void afterExecution(String response) {

            }

            @Override
            public DataA convertResponse(String response) {
                return null;
            }

            @Override
            public void afterRunService() {

            }
        }.myRun();
    }

}
