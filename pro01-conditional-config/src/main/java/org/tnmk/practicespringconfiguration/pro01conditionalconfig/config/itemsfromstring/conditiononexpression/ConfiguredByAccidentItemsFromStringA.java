package org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemsfromstring.conditiononexpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnExpression("'${items-from-string.services-array}'.contains('a')")
public class ConfiguredByAccidentItemsFromStringA {
}
