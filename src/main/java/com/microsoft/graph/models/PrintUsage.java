package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintUsage extends Entity implements Parsable {
    /** The completedBlackAndWhiteJobCount property */
    private Long completedBlackAndWhiteJobCount;
    /** The completedColorJobCount property */
    private Long completedColorJobCount;
    /** The incompleteJobCount property */
    private Long incompleteJobCount;
    /** The usageDate property */
    private LocalDate usageDate;
    /**
     * Instantiates a new printUsage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintUsage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printUsage
     */
    @javax.annotation.Nonnull
    public static PrintUsage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedBlackAndWhiteJobCount() {
        return this.completedBlackAndWhiteJobCount;
    }
    /**
     * Gets the completedColorJobCount property value. The completedColorJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedColorJobCount() {
        return this.completedColorJobCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedBlackAndWhiteJobCount", (n) -> { this.setCompletedBlackAndWhiteJobCount(n.getLongValue()); });
        deserializerMap.put("completedColorJobCount", (n) -> { this.setCompletedColorJobCount(n.getLongValue()); });
        deserializerMap.put("incompleteJobCount", (n) -> { this.setIncompleteJobCount(n.getLongValue()); });
        deserializerMap.put("usageDate", (n) -> { this.setUsageDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incompleteJobCount property value. The incompleteJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIncompleteJobCount() {
        return this.incompleteJobCount;
    }
    /**
     * Gets the usageDate property value. The usageDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getUsageDate() {
        return this.usageDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("completedBlackAndWhiteJobCount", this.getCompletedBlackAndWhiteJobCount());
        writer.writeLongValue("completedColorJobCount", this.getCompletedColorJobCount());
        writer.writeLongValue("incompleteJobCount", this.getIncompleteJobCount());
        writer.writeLocalDateValue("usageDate", this.getUsageDate());
    }
    /**
     * Sets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @param value Value to set for the completedBlackAndWhiteJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedBlackAndWhiteJobCount(@javax.annotation.Nullable final Long value) {
        this.completedBlackAndWhiteJobCount = value;
    }
    /**
     * Sets the completedColorJobCount property value. The completedColorJobCount property
     * @param value Value to set for the completedColorJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedColorJobCount(@javax.annotation.Nullable final Long value) {
        this.completedColorJobCount = value;
    }
    /**
     * Sets the incompleteJobCount property value. The incompleteJobCount property
     * @param value Value to set for the incompleteJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncompleteJobCount(@javax.annotation.Nullable final Long value) {
        this.incompleteJobCount = value;
    }
    /**
     * Sets the usageDate property value. The usageDate property
     * @param value Value to set for the usageDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsageDate(@javax.annotation.Nullable final LocalDate value) {
        this.usageDate = value;
    }
}
