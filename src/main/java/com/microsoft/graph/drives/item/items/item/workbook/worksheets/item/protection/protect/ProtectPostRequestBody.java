package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.protection.protect;

import com.microsoft.graph.models.WorkbookWorksheetProtectionOptions;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProtectPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The options property
     */
    private WorkbookWorksheetProtectionOptions options;
    /**
     * Instantiates a new protectPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ProtectPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a protectPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ProtectPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("options", (n) -> { this.setOptions(n.getObjectValue(WorkbookWorksheetProtectionOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the options property value. The options property
     * @return a workbookWorksheetProtectionOptions
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheetProtectionOptions getOptions() {
        return this.options;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("options", this.getOptions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the options property value. The options property
     * @param value Value to set for the options property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOptions(@jakarta.annotation.Nullable final WorkbookWorksheetProtectionOptions value) {
        this.options = value;
    }
}
