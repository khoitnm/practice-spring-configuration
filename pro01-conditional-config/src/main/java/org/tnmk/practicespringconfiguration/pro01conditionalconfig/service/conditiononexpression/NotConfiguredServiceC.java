package org.tnmk.practicespringconfiguration.pro01conditionalconfig.service.conditiononexpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;
/**
 * @see ConfiguredByAccidentServiceC
 */
@Service
@ConditionalOnExpression("#{T(java.util.Arrays).asList('${data-config.services-list}').contains('c')}")
public class NotConfiguredServiceC {
}
