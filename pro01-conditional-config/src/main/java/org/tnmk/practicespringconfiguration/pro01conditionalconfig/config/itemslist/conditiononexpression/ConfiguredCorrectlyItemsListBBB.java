package org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemslist.conditiononexpression;

import org.springframework.stereotype.Service;


@Service
//I assume that this expression should work. But somehow it shows error cannot find the bean 'itemsListPropertiesB'.
//It's weird because that bean is created inside PropertiesConfig.
//@ConditionalOnExpression("#{@itemsListPropertiesB.services.contains('bbb')}")
public class ConfiguredCorrectlyItemsListBBB {
}
