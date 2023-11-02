package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationRoot implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new EducationRoot and sets the default values.
     */
    public EducationRoot() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationRoot
     */
    @jakarta.annotation.Nonnull
    public static EducationRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationRoot();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the classes property value. The classes property
     * @return a java.util.List<EducationClass>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this.getBackingStore().get("classes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("classes", (n) -> { this.setClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
        deserializerMap.put("me", (n) -> { this.setMe(n.getObjectValue(EducationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("schools", (n) -> { this.setSchools(n.getCollectionOfObjectValues(EducationSchool::createFromDiscriminatorValue)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the me property value. The me property
     * @return a EducationUser
     */
    @jakarta.annotation.Nullable
    public EducationUser getMe() {
        return this.getBackingStore().get("me");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the schools property value. The schools property
     * @return a java.util.List<EducationSchool>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this.getBackingStore().get("schools");
    }
    /**
     * Gets the users property value. The users property
     * @return a java.util.List<EducationUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationUser> getUsers() {
        return this.getBackingStore().get("users");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("classes", this.getClasses());
        writer.writeObjectValue("me", this.getMe());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("schools", this.getSchools());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the classes property value. The classes property
     * @param value Value to set for the classes property.
     */
    public void setClasses(@jakarta.annotation.Nullable final java.util.List<EducationClass> value) {
        this.getBackingStore().set("classes", value);
    }
    /**
     * Sets the me property value. The me property
     * @param value Value to set for the me property.
     */
    public void setMe(@jakarta.annotation.Nullable final EducationUser value) {
        this.getBackingStore().set("me", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the schools property value. The schools property
     * @param value Value to set for the schools property.
     */
    public void setSchools(@jakarta.annotation.Nullable final java.util.List<EducationSchool> value) {
        this.getBackingStore().set("schools", value);
    }
    /**
     * Sets the users property value. The users property
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<EducationUser> value) {
        this.getBackingStore().set("users", value);
    }
}
