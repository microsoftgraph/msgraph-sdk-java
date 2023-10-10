package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubjectRightsRequestEnumeratedMailboxLocation extends SubjectRightsRequestMailboxLocation implements Parsable {
    /**
     * The userPrincipalNames property
     */
    private java.util.List<String> userPrincipalNames;
    /**
     * Instantiates a new SubjectRightsRequestEnumeratedMailboxLocation and sets the default values.
     */
    public SubjectRightsRequestEnumeratedMailboxLocation() {
        super();
        this.setOdataType("#microsoft.graph.subjectRightsRequestEnumeratedMailboxLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubjectRightsRequestEnumeratedMailboxLocation
     */
    @jakarta.annotation.Nonnull
    public static SubjectRightsRequestEnumeratedMailboxLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequestEnumeratedMailboxLocation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userPrincipalNames", (n) -> { this.setUserPrincipalNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the userPrincipalNames property value. The userPrincipalNames property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUserPrincipalNames() {
        return this.userPrincipalNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("userPrincipalNames", this.getUserPrincipalNames());
    }
    /**
     * Sets the userPrincipalNames property value. The userPrincipalNames property
     * @param value Value to set for the userPrincipalNames property.
     */
    public void setUserPrincipalNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.userPrincipalNames = value;
    }
}
