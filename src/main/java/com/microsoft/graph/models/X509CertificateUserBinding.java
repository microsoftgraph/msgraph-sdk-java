package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class X509CertificateUserBinding implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The priority of the binding. Azure AD uses the binding with the highest priority. This value must be a non-negative integer and unique in the collection of objects in the certificateUserBindings property of an x509CertificateAuthenticationMethodConfiguration object. Required */
    private Integer _priority;
    /** Defines the Azure AD user property of the user object to use for the binding. The possible values are: userPrincipalName, onPremisesUserPrincipalName, certificateUserIds. Required. */
    private String _userProperty;
    /** The field on the X.509 certificate to use for the binding. The possible values are: PrincipalName, RFC822Name, SubjectKeyIdentifier, SHA1PublicKey. */
    private String _x509CertificateField;
    /**
     * Instantiates a new x509CertificateUserBinding and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public X509CertificateUserBinding() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.x509CertificateUserBinding");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a x509CertificateUserBinding
     */
    @javax.annotation.Nonnull
    public static X509CertificateUserBinding createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateUserBinding();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final X509CertificateUserBinding currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
        deserializerMap.put("userProperty", (n) -> { currentObject.setUserProperty(n.getStringValue()); });
        deserializerMap.put("x509CertificateField", (n) -> { currentObject.setX509CertificateField(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the priority property value. The priority of the binding. Azure AD uses the binding with the highest priority. This value must be a non-negative integer and unique in the collection of objects in the certificateUserBindings property of an x509CertificateAuthenticationMethodConfiguration object. Required
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the userProperty property value. Defines the Azure AD user property of the user object to use for the binding. The possible values are: userPrincipalName, onPremisesUserPrincipalName, certificateUserIds. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserProperty() {
        return this._userProperty;
    }
    /**
     * Gets the x509CertificateField property value. The field on the X.509 certificate to use for the binding. The possible values are: PrincipalName, RFC822Name, SubjectKeyIdentifier, SHA1PublicKey.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getX509CertificateField() {
        return this._x509CertificateField;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeStringValue("userProperty", this.getUserProperty());
        writer.writeStringValue("x509CertificateField", this.getX509CertificateField());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the priority property value. The priority of the binding. Azure AD uses the binding with the highest priority. This value must be a non-negative integer and unique in the collection of objects in the certificateUserBindings property of an x509CertificateAuthenticationMethodConfiguration object. Required
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the userProperty property value. Defines the Azure AD user property of the user object to use for the binding. The possible values are: userPrincipalName, onPremisesUserPrincipalName, certificateUserIds. Required.
     * @param value Value to set for the userProperty property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserProperty(@javax.annotation.Nullable final String value) {
        this._userProperty = value;
    }
    /**
     * Sets the x509CertificateField property value. The field on the X.509 certificate to use for the binding. The possible values are: PrincipalName, RFC822Name, SubjectKeyIdentifier, SHA1PublicKey.
     * @param value Value to set for the x509CertificateField property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setX509CertificateField(@javax.annotation.Nullable final String value) {
        this._x509CertificateField = value;
    }
}
