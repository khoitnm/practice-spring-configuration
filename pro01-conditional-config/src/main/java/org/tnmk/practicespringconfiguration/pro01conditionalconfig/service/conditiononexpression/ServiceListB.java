package org.tnmk.practicespringconfiguration.pro01conditionalconfig.service.conditiononexpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnExpression("'${data-config.services-list}'.contains('b')")
public class ServiceListB {
}
