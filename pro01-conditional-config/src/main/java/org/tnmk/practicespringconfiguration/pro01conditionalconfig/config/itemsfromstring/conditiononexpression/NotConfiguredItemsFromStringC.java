package org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemsfromstring.conditiononexpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;
/**
 * @see ConfiguredByAccidentItemsFromStringC
 */
@Service
@ConditionalOnExpression("#{T(java.util.Arrays).asList('${items-from-string.services-list}').contains('c')}")
public class NotConfiguredItemsFromStringC {
}
