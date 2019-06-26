package org.tnmk.practicespringconfiguration.pro01oncondition.service.conditiononexpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnExpression("'${data-config.services-array}'.contains('a')")
public class ServiceArrayA {
}
