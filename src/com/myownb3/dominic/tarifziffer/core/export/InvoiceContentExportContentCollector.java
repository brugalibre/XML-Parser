package com.myownb3.dominic.tarifziffer.core.export;

import java.util.List;

import com.myownb3.dominic.tarifziffer.core.export.mode.ExportMode;

/**
 * The {@link InvoiceContentExportContentCollector} collects the content to export depending on the {@link ExportMode}
 * 
 * @author DStalder
 *
 */
public interface InvoiceContentExportContentCollector {

   /**
    * @return the collected content as a {@link List} of {@link String}s
    */
   List<String> collectContent();
}
