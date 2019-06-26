package org.tnmk.practicespringconfiguration.pro01oncondition.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnExpression("'${data-config.services-list}'.contains('c')")
public class ConfiguredByAccidentServiceC {
}
