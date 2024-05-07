package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilePlanCitation extends FilePlanDescriptorBase implements Parsable {
    /**
     * Instantiates a new {@link FilePlanCitation} and sets the default values.
     */
    public FilePlanCitation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FilePlanCitation}
     */
    @jakarta.annotation.Nonnull
    public static FilePlanCitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilePlanCitation();
    }
    /**
     * Gets the citationJurisdiction property value. Represents the jurisdiction or agency that published the filePlanCitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCitationJurisdiction() {
        return this.backingStore.get("citationJurisdiction");
    }
    /**
     * Gets the citationUrl property value. Represents the URL to the published filePlanCitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCitationUrl() {
        return this.backingStore.get("citationUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("citationJurisdiction", (n) -> { this.setCitationJurisdiction(n.getStringValue()); });
        deserializerMap.put("citationUrl", (n) -> { this.setCitationUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("citationJurisdiction", this.getCitationJurisdiction());
        writer.writeStringValue("citationUrl", this.getCitationUrl());
    }
    /**
     * Sets the citationJurisdiction property value. Represents the jurisdiction or agency that published the filePlanCitation.
     * @param value Value to set for the citationJurisdiction property.
     */
    public void setCitationJurisdiction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("citationJurisdiction", value);
    }
    /**
     * Sets the citationUrl property value. Represents the URL to the published filePlanCitation.
     * @param value Value to set for the citationUrl property.
     */
    public void setCitationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("citationUrl", value);
    }
}
