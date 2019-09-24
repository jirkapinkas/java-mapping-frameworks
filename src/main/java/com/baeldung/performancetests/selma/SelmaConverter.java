package com.baeldung.performancetests.selma;

import com.baeldung.performancetests.Converter;
import com.baeldung.performancetests.model.destination.DestinationCode;
import com.baeldung.performancetests.model.destination.Order;
import com.baeldung.performancetests.model.source.SourceCode;
import com.baeldung.performancetests.model.source.SourceOrder;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Selma;

@Mapper(withCustomFields = {
        @Field({"status", "orderStatus"})
})
public interface SelmaConverter extends Converter {

    SelmaConverter MAPPER = Selma.builder(SelmaConverter.class).build();

    @Override
    Order convert(SourceOrder sourceOrder);

    @Override
    DestinationCode convert(SourceCode sourceCode);

}
