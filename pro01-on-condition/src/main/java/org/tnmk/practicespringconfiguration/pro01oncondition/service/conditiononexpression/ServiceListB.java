package org.tnmk.practicespringconfiguration.pro01oncondition.service.conditiononexpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnExpression("'${data-config.services-list}'.contains('b')")
public class ServiceListB {
}
