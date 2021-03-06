package com.myownb3.dominic.tarifziffer.core.export.impl.header;

import java.util.List;

import com.myownb3.dominic.invoice.attrs.metadata.InvoiceAttr;
import com.myownb3.dominic.invoice.attrs.metadata.constants.InvoiceAttrs;
import com.myownb3.dominic.invoice.attrs.metadata.type.ContentType;
import com.myownb3.dominic.tarifziffer.weka.WekaConstants;

public class MergedWekaHeaderSupplier extends WekaHeaderSupplier {

   @Override
   protected String getTypeRep(InvoiceAttr invoiceAttr) {
      return WekaConstants.NUMERIC;// in a merged export, the categorical values are converted into numeric ones
   }

   @Override
   protected List<InvoiceAttr> evalAllInvoiceAttrs4AtAttributeAnnotation(ContentType contentType) {
      return evalAllInvoiceAttrsIncCategoricalValues4AtAttributeAnnotation(contentType);
   }

   private List<InvoiceAttr> evalAllInvoiceAttrsIncCategoricalValues4AtAttributeAnnotation(ContentType contentType) {
      List<InvoiceAttr> allInvoiceAttrs = InvoiceAttrs.INSTANCE.getAllRelevantInvoiceAttrs(contentType);
      return InvoiceAttrs.INSTANCE.evalAllInvoiceAttrsIncludingCategoricalValues(allInvoiceAttrs, true);
   }
}
