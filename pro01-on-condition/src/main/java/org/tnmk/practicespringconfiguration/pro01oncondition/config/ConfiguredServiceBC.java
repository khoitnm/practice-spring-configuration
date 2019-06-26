package org.tnmk.practicespringconfiguration.pro01oncondition.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

/**
 * @see ConfiguredByAccidentServiceC
 */
@Service
@ConditionalOnExpression("#{T(java.util.Arrays).asList('${data-config.services-list}').contains('bc')}")
public class ConfiguredServiceBC {
}
