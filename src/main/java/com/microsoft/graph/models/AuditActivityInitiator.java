package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuditActivityInitiator implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If the resource initiating the activity is an app, this property indicates all the app related information like appId, Name, servicePrincipalId, Name. */
    private AppIdentity _app;
    /** The OdataType property */
    private String _odataType;
    /** If the resource initiating the activity is a user, this property Indicates all the user related information like userId, Name, UserPrinicpalName. */
    private UserIdentity _user;
    /**
     * Instantiates a new auditActivityInitiator and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditActivityInitiator() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.auditActivityInitiator");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a auditActivityInitiator
     */
    @javax.annotation.Nonnull
    public static AuditActivityInitiator createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditActivityInitiator();
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
     * Gets the app property value. If the resource initiating the activity is an app, this property indicates all the app related information like appId, Name, servicePrincipalId, Name.
     * @return a appIdentity
     */
    @javax.annotation.Nullable
    public AppIdentity getApp() {
        return this._app;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuditActivityInitiator currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("app", (n) -> { currentObject.setApp(n.getObjectValue(AppIdentity::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("user", (n) -> { currentObject.setUser(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        }};
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
     * Gets the user property value. If the resource initiating the activity is a user, this property Indicates all the user related information like userId, Name, UserPrinicpalName.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getUser() {
        return this._user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("app", this.getApp());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("user", this.getUser());
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
     * Sets the app property value. If the resource initiating the activity is an app, this property indicates all the app related information like appId, Name, servicePrincipalId, Name.
     * @param value Value to set for the app property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApp(@javax.annotation.Nullable final AppIdentity value) {
        this._app = value;
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
     * Sets the user property value. If the resource initiating the activity is a user, this property Indicates all the user related information like userId, Name, UserPrinicpalName.
     * @param value Value to set for the user property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUser(@javax.annotation.Nullable final UserIdentity value) {
        this._user = value;
    }
}
