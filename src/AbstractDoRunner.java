public abstract class AbstractDoRunner<T> {

    public void myRun() {
        beforeRunService();

        //logger.log("login");

        String response = getResponse();

        logRawData(response);

        //logger.log(response);

        afterExecution(response);

        T converted = convertResponse(response);

        afterRunService();
    }


    public abstract void beforeRunService();

    public abstract String getResponse();

    public abstract void afterExecution(String response);

    public void logRawData(String rawData)
    {
        System.out.println(rawData);
    }

    public abstract T convertResponse(String response);

    public abstract void afterRunService();

}