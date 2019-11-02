package org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.main.sampledependent;

import org.springframework.stereotype.Component;
import org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.main.SampleSharedServiceImpl;

/**
 * This class is used to illustrate a dependency service which is used by {@link SampleSharedServiceImpl}
 * but it won't be used by the testing implementation SampleSharedServiceTestImpl.
 * <br/>
 * <p/>
 * <strong>
 * This bean will be initiated in real running only (because it's used by {@link SampleSharedServiceImpl}.
 * However, it will NOT be initiated in testing.
 * </strong>
 */
@Component
public class SampleDependentComponent {
    public String sayYourself() {
        return "Dependent_" + System.nanoTime();
    }
}
