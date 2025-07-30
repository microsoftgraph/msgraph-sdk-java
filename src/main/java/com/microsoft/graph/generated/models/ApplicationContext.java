package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationContext extends SignInContext implements Parsable {
    /**
     * Instantiates a new {@link ApplicationContext} and sets the default values.
     */
    public ApplicationContext() {
        super();
        this.setOdataType("#microsoft.graph.applicationContext");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationContext}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationContext createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationContext();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("includeApplications", (n) -> { this.setIncludeApplications(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the includeApplications property value. Collection of appId values for the applications.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeApplications() {
        return this.backingStore.get("includeApplications");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("includeApplications", this.getIncludeApplications());
    }
    /**
     * Sets the includeApplications property value. Collection of appId values for the applications.
     * @param value Value to set for the includeApplications property.
     */
    public void setIncludeApplications(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeApplications", value);
    }
}
