package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintUsage extends Entity implements Parsable {
    /**
     * Instantiates a new PrintUsage and sets the default values.
     */
    public PrintUsage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintUsage
     */
    @jakarta.annotation.Nonnull
    public static PrintUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.printUsageByPrinter": return new PrintUsageByPrinter();
                case "#microsoft.graph.printUsageByUser": return new PrintUsageByUser();
            }
        }
        return new PrintUsage();
    }
    /**
     * Gets the blackAndWhitePageCount property value. The blackAndWhitePageCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getBlackAndWhitePageCount() {
        return this.BackingStore.get("blackAndWhitePageCount");
    }
    /**
     * Gets the colorPageCount property value. The colorPageCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getColorPageCount() {
        return this.BackingStore.get("colorPageCount");
    }
    /**
     * Gets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCompletedBlackAndWhiteJobCount() {
        return this.BackingStore.get("completedBlackAndWhiteJobCount");
    }
    /**
     * Gets the completedColorJobCount property value. The completedColorJobCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCompletedColorJobCount() {
        return this.BackingStore.get("completedColorJobCount");
    }
    /**
     * Gets the completedJobCount property value. The completedJobCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCompletedJobCount() {
        return this.BackingStore.get("completedJobCount");
    }
    /**
     * Gets the doubleSidedSheetCount property value. The doubleSidedSheetCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDoubleSidedSheetCount() {
        return this.BackingStore.get("doubleSidedSheetCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blackAndWhitePageCount", (n) -> { this.setBlackAndWhitePageCount(n.getLongValue()); });
        deserializerMap.put("colorPageCount", (n) -> { this.setColorPageCount(n.getLongValue()); });
        deserializerMap.put("completedBlackAndWhiteJobCount", (n) -> { this.setCompletedBlackAndWhiteJobCount(n.getLongValue()); });
        deserializerMap.put("completedColorJobCount", (n) -> { this.setCompletedColorJobCount(n.getLongValue()); });
        deserializerMap.put("completedJobCount", (n) -> { this.setCompletedJobCount(n.getLongValue()); });
        deserializerMap.put("doubleSidedSheetCount", (n) -> { this.setDoubleSidedSheetCount(n.getLongValue()); });
        deserializerMap.put("incompleteJobCount", (n) -> { this.setIncompleteJobCount(n.getLongValue()); });
        deserializerMap.put("mediaSheetCount", (n) -> { this.setMediaSheetCount(n.getLongValue()); });
        deserializerMap.put("pageCount", (n) -> { this.setPageCount(n.getLongValue()); });
        deserializerMap.put("singleSidedSheetCount", (n) -> { this.setSingleSidedSheetCount(n.getLongValue()); });
        deserializerMap.put("usageDate", (n) -> { this.setUsageDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incompleteJobCount property value. The incompleteJobCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getIncompleteJobCount() {
        return this.BackingStore.get("incompleteJobCount");
    }
    /**
     * Gets the mediaSheetCount property value. The mediaSheetCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMediaSheetCount() {
        return this.BackingStore.get("mediaSheetCount");
    }
    /**
     * Gets the pageCount property value. The pageCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPageCount() {
        return this.BackingStore.get("pageCount");
    }
    /**
     * Gets the singleSidedSheetCount property value. The singleSidedSheetCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSingleSidedSheetCount() {
        return this.BackingStore.get("singleSidedSheetCount");
    }
    /**
     * Gets the usageDate property value. The usageDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getUsageDate() {
        return this.BackingStore.get("usageDate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("blackAndWhitePageCount", this.getBlackAndWhitePageCount());
        writer.writeLongValue("colorPageCount", this.getColorPageCount());
        writer.writeLongValue("completedBlackAndWhiteJobCount", this.getCompletedBlackAndWhiteJobCount());
        writer.writeLongValue("completedColorJobCount", this.getCompletedColorJobCount());
        writer.writeLongValue("completedJobCount", this.getCompletedJobCount());
        writer.writeLongValue("doubleSidedSheetCount", this.getDoubleSidedSheetCount());
        writer.writeLongValue("incompleteJobCount", this.getIncompleteJobCount());
        writer.writeLongValue("mediaSheetCount", this.getMediaSheetCount());
        writer.writeLongValue("pageCount", this.getPageCount());
        writer.writeLongValue("singleSidedSheetCount", this.getSingleSidedSheetCount());
        writer.writeLocalDateValue("usageDate", this.getUsageDate());
    }
    /**
     * Sets the blackAndWhitePageCount property value. The blackAndWhitePageCount property
     * @param value Value to set for the blackAndWhitePageCount property.
     */
    public void setBlackAndWhitePageCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("blackAndWhitePageCount", value);
    }
    /**
     * Sets the colorPageCount property value. The colorPageCount property
     * @param value Value to set for the colorPageCount property.
     */
    public void setColorPageCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("colorPageCount", value);
    }
    /**
     * Sets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @param value Value to set for the completedBlackAndWhiteJobCount property.
     */
    public void setCompletedBlackAndWhiteJobCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("completedBlackAndWhiteJobCount", value);
    }
    /**
     * Sets the completedColorJobCount property value. The completedColorJobCount property
     * @param value Value to set for the completedColorJobCount property.
     */
    public void setCompletedColorJobCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("completedColorJobCount", value);
    }
    /**
     * Sets the completedJobCount property value. The completedJobCount property
     * @param value Value to set for the completedJobCount property.
     */
    public void setCompletedJobCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("completedJobCount", value);
    }
    /**
     * Sets the doubleSidedSheetCount property value. The doubleSidedSheetCount property
     * @param value Value to set for the doubleSidedSheetCount property.
     */
    public void setDoubleSidedSheetCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("doubleSidedSheetCount", value);
    }
    /**
     * Sets the incompleteJobCount property value. The incompleteJobCount property
     * @param value Value to set for the incompleteJobCount property.
     */
    public void setIncompleteJobCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("incompleteJobCount", value);
    }
    /**
     * Sets the mediaSheetCount property value. The mediaSheetCount property
     * @param value Value to set for the mediaSheetCount property.
     */
    public void setMediaSheetCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("mediaSheetCount", value);
    }
    /**
     * Sets the pageCount property value. The pageCount property
     * @param value Value to set for the pageCount property.
     */
    public void setPageCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("pageCount", value);
    }
    /**
     * Sets the singleSidedSheetCount property value. The singleSidedSheetCount property
     * @param value Value to set for the singleSidedSheetCount property.
     */
    public void setSingleSidedSheetCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("singleSidedSheetCount", value);
    }
    /**
     * Sets the usageDate property value. The usageDate property
     * @param value Value to set for the usageDate property.
     */
    public void setUsageDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("usageDate", value);
    }
}
