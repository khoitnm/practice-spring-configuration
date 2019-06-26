package org.tnmk.practicespringconfiguration.pro01oncondition.service.conditiononexpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

/**
 * With this configuration:<br/>
 * <pre>
 * data-config.services-list: b, bb, bc
 * </pre>
 * This bean is populated because the character 'c' exist inside the string 'b, bb, bc'.<br/>
 * However, this is not what we want. We want that this bean should be only populated only if the configuration has any element with exactly character 'c', the element 'bc' is not acceptable.<br/>
 * <p/>
 * Please view {@link NotConfiguredServiceC} and {@link ConfiguredServiceBC} for the correct configuration.
 */
@Service
@ConditionalOnExpression("'${data-config.services-list}'.contains('c')")
public class ConfiguredByAccidentServiceC {
}
