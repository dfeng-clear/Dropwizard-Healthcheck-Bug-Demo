package feng.david;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class HealthCheckBugDemoServiceApplication extends Application<HealthCheckBugDemoServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HealthCheckBugDemoServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "HealthCheckBugDemoService";
    }

    @Override
    public void initialize(final Bootstrap<HealthCheckBugDemoServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HealthCheckBugDemoServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
