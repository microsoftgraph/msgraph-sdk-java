package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgreementFile extends AgreementFileProperties implements Parsable {
    /**
     * Instantiates a new AgreementFile and sets the default values.
     */
    public AgreementFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AgreementFile
     */
    @jakarta.annotation.Nonnull
    public static AgreementFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgreementFile();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("localizations", (n) -> { this.setLocalizations(n.getCollectionOfObjectValues(AgreementFileLocalization::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the localizations property value. The localized version of the terms of use agreement files attached to the agreement.
     * @return a java.util.List<AgreementFileLocalization>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgreementFileLocalization> getLocalizations() {
        return this.backingStore.get("localizations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("localizations", this.getLocalizations());
    }
    /**
     * Sets the localizations property value. The localized version of the terms of use agreement files attached to the agreement.
     * @param value Value to set for the localizations property.
     */
    public void setLocalizations(@jakarta.annotation.Nullable final java.util.List<AgreementFileLocalization> value) {
        this.backingStore.set("localizations", value);
    }
}
