// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeRequest;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeSortRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeClearRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeClearRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeDeleteRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeDeleteRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeInsertRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeInsertRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeMergeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeMergeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeUnmergeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeUnmergeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBoundingRectRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeBoundingRectRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeCellRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeCellRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsAfterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeColumnsAfterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsAfterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeColumnsAfterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsBeforeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeColumnsBeforeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsBeforeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeColumnsBeforeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeEntireColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeEntireColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeEntireRowRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeEntireRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeIntersectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeIntersectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeLastCellRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeLastCellRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeLastColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeLastColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeLastRowRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeLastRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeOffsetRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeOffsetRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeResizedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeResizedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsAboveRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeRowsAboveRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsAboveRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeRowsAboveRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsBelowRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeRowsBelowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsBelowRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeRowsBelowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeUsedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeUsedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeUsedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeUsedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeVisibleViewRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeVisibleViewRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Request Builder.
 */
public class WorkbookRangeRequestBuilder extends BaseRequestBuilder implements IWorkbookRangeRequestBuilder {

    /**
     * The request builder for the WorkbookRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookRangeRequest instance
     */
    public IWorkbookRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeRequest instance
     */
    public IWorkbookRangeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookRangeRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the IWorkbookRangeFormatRequestBuilder instance
     */
    public IWorkbookRangeFormatRequestBuilder format() {
        return new WorkbookRangeFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the IWorkbookRangeSortRequestBuilder instance
     */
    public IWorkbookRangeSortRequestBuilder sort() {
        return new WorkbookRangeSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    public IWorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }

    public IWorkbookRangeClearRequestBuilder clear(final String applyTo) {
        return new WorkbookRangeClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null, applyTo);
    }

    public IWorkbookRangeDeleteRequestBuilder delete(final String shift) {
        return new WorkbookRangeDeleteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delete"), getClient(), null, shift);
    }

    public IWorkbookRangeInsertRequestBuilder insert(final String shift) {
        return new WorkbookRangeInsertRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.insert"), getClient(), null, shift);
    }

    public IWorkbookRangeMergeRequestBuilder merge(final Boolean across) {
        return new WorkbookRangeMergeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.merge"), getClient(), null, across);
    }

    public IWorkbookRangeUnmergeRequestBuilder unmerge() {
        return new WorkbookRangeUnmergeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unmerge"), getClient(), null);
    }

    public IWorkbookRangeBoundingRectRequestBuilder boundingRect(final String anotherRange) {
        return new WorkbookRangeBoundingRectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.boundingRect"), getClient(), null, anotherRange);
    }

    public IWorkbookRangeCellRequestBuilder cell(final Integer row, final Integer column) {
        return new WorkbookRangeCellRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cell"), getClient(), null, row, column);
    }

    public IWorkbookRangeColumnRequestBuilder column(final Integer column) {
        return new WorkbookRangeColumnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.column"), getClient(), null, column);
    }

    public IWorkbookRangeColumnsAfterRequestBuilder columnsAfter() {
        return new WorkbookRangeColumnsAfterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columnsAfter"), getClient(), null);
    }

    public IWorkbookRangeColumnsAfterRequestBuilder columnsAfter(final Integer count) {
        return new WorkbookRangeColumnsAfterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columnsAfter"), getClient(), null, count);
    }

    public IWorkbookRangeColumnsBeforeRequestBuilder columnsBefore() {
        return new WorkbookRangeColumnsBeforeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columnsBefore"), getClient(), null);
    }

    public IWorkbookRangeColumnsBeforeRequestBuilder columnsBefore(final Integer count) {
        return new WorkbookRangeColumnsBeforeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columnsBefore"), getClient(), null, count);
    }

    public IWorkbookRangeEntireColumnRequestBuilder entireColumn() {
        return new WorkbookRangeEntireColumnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.entireColumn"), getClient(), null);
    }

    public IWorkbookRangeEntireRowRequestBuilder entireRow() {
        return new WorkbookRangeEntireRowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.entireRow"), getClient(), null);
    }

    public IWorkbookRangeIntersectionRequestBuilder intersection(final String anotherRange) {
        return new WorkbookRangeIntersectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.intersection"), getClient(), null, anotherRange);
    }

    public IWorkbookRangeLastCellRequestBuilder lastCell() {
        return new WorkbookRangeLastCellRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lastCell"), getClient(), null);
    }

    public IWorkbookRangeLastColumnRequestBuilder lastColumn() {
        return new WorkbookRangeLastColumnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lastColumn"), getClient(), null);
    }

    public IWorkbookRangeLastRowRequestBuilder lastRow() {
        return new WorkbookRangeLastRowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lastRow"), getClient(), null);
    }

    public IWorkbookRangeOffsetRangeRequestBuilder offsetRange(final Integer rowOffset, final Integer columnOffset) {
        return new WorkbookRangeOffsetRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.offsetRange"), getClient(), null, rowOffset, columnOffset);
    }

    public IWorkbookRangeResizedRangeRequestBuilder resizedRange(final Integer deltaRows, final Integer deltaColumns) {
        return new WorkbookRangeResizedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resizedRange"), getClient(), null, deltaRows, deltaColumns);
    }

    public IWorkbookRangeRowRequestBuilder row(final Integer row) {
        return new WorkbookRangeRowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.row"), getClient(), null, row);
    }

    public IWorkbookRangeRowsAboveRequestBuilder rowsAbove() {
        return new WorkbookRangeRowsAboveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rowsAbove"), getClient(), null);
    }

    public IWorkbookRangeRowsAboveRequestBuilder rowsAbove(final Integer count) {
        return new WorkbookRangeRowsAboveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rowsAbove"), getClient(), null, count);
    }

    public IWorkbookRangeRowsBelowRequestBuilder rowsBelow() {
        return new WorkbookRangeRowsBelowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rowsBelow"), getClient(), null);
    }

    public IWorkbookRangeRowsBelowRequestBuilder rowsBelow(final Integer count) {
        return new WorkbookRangeRowsBelowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rowsBelow"), getClient(), null, count);
    }

    public IWorkbookRangeUsedRangeRequestBuilder usedRange() {
        return new WorkbookRangeUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null);
    }

    public IWorkbookRangeUsedRangeRequestBuilder usedRange(final Boolean valuesOnly) {
        return new WorkbookRangeUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null, valuesOnly);
    }

    public IWorkbookRangeVisibleViewRequestBuilder visibleView() {
        return new WorkbookRangeVisibleViewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.visibleView"), getClient(), null);
    }
}

