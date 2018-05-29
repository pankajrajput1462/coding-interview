package priorityjob;

import lombok.Data;

@Data
public class Job implements Runnable {
    private String jobName;
    private JobPriority jobPriority;

    public Job(String jobName, JobPriority jobPriority) {
        this.jobName=jobName;
        this.jobName=jobName;
    }

    @Override
    public void run() {
        System.out.println("Job:" + jobName +
                " Priority:" + jobPriority);
        try {
            Thread.sleep(1000); // to simulate actual execution time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
