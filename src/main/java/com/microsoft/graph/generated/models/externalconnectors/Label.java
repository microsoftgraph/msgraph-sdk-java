package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Label implements ValuedEnum {
    Title("title"),
    Url("url"),
    CreatedBy("createdBy"),
    LastModifiedBy("lastModifiedBy"),
    Authors("authors"),
    CreatedDateTime("createdDateTime"),
    LastModifiedDateTime("lastModifiedDateTime"),
    FileName("fileName"),
    FileExtension("fileExtension"),
    UnknownFutureValue("unknownFutureValue"),
    ContainerName("containerName"),
    ContainerUrl("containerUrl"),
    IconUrl("iconUrl"),
    AssignedToPeople("assignedToPeople"),
    ClosedBy("closedBy"),
    ClosedDate("closedDate"),
    Priority("priority"),
    SprintName("sprintName"),
    Tags("tags"),
    Severity("severity"),
    State("state"),
    DueDate("dueDate"),
    ItemParentId("itemParentId"),
    ItemPath("itemPath"),
    ItemType("itemType"),
    NumberOfReactions("numberOfReactions"),
    ParentUrl("parentUrl"),
    PriorityNormalized("priorityNormalized"),
    ReportedBy("reportedBy"),
    SecondaryId("secondaryId"),
    PersonEmails("personEmails"),
    PersonAddresses("personAddresses"),
    PersonAnniversaries("personAnniversaries"),
    PersonName("personName"),
    PersonNote("personNote"),
    PersonPhones("personPhones"),
    PersonCurrentPosition("personCurrentPosition"),
    PersonWebAccounts("personWebAccounts"),
    PersonWebSite("personWebSite"),
    PersonSkills("personSkills"),
    PersonProjects("personProjects"),
    PersonAccount("personAccount"),
    PersonAwards("personAwards"),
    PersonCertifications("personCertifications"),
    PersonAssistants("personAssistants"),
    PersonColleagues("personColleagues"),
    PersonManager("personManager"),
    PersonAlternateContacts("personAlternateContacts"),
    PersonEmergencyContacts("personEmergencyContacts"),
    PersonEducationalActivities("personEducationalActivities"),
    PersonInterests("personInterests"),
    PersonLanguages("personLanguages"),
    PersonPublications("personPublications"),
    PersonPatents("personPatents");
    public final String value;
    Label(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Label forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "title": return Title;
            case "url": return Url;
            case "createdBy": return CreatedBy;
            case "lastModifiedBy": return LastModifiedBy;
            case "authors": return Authors;
            case "createdDateTime": return CreatedDateTime;
            case "lastModifiedDateTime": return LastModifiedDateTime;
            case "fileName": return FileName;
            case "fileExtension": return FileExtension;
            case "unknownFutureValue": return UnknownFutureValue;
            case "containerName": return ContainerName;
            case "containerUrl": return ContainerUrl;
            case "iconUrl": return IconUrl;
            case "assignedToPeople": return AssignedToPeople;
            case "closedBy": return ClosedBy;
            case "closedDate": return ClosedDate;
            case "priority": return Priority;
            case "sprintName": return SprintName;
            case "tags": return Tags;
            case "severity": return Severity;
            case "state": return State;
            case "dueDate": return DueDate;
            case "itemParentId": return ItemParentId;
            case "itemPath": return ItemPath;
            case "itemType": return ItemType;
            case "numberOfReactions": return NumberOfReactions;
            case "parentUrl": return ParentUrl;
            case "priorityNormalized": return PriorityNormalized;
            case "reportedBy": return ReportedBy;
            case "secondaryId": return SecondaryId;
            case "personEmails": return PersonEmails;
            case "personAddresses": return PersonAddresses;
            case "personAnniversaries": return PersonAnniversaries;
            case "personName": return PersonName;
            case "personNote": return PersonNote;
            case "personPhones": return PersonPhones;
            case "personCurrentPosition": return PersonCurrentPosition;
            case "personWebAccounts": return PersonWebAccounts;
            case "personWebSite": return PersonWebSite;
            case "personSkills": return PersonSkills;
            case "personProjects": return PersonProjects;
            case "personAccount": return PersonAccount;
            case "personAwards": return PersonAwards;
            case "personCertifications": return PersonCertifications;
            case "personAssistants": return PersonAssistants;
            case "personColleagues": return PersonColleagues;
            case "personManager": return PersonManager;
            case "personAlternateContacts": return PersonAlternateContacts;
            case "personEmergencyContacts": return PersonEmergencyContacts;
            case "personEducationalActivities": return PersonEducationalActivities;
            case "personInterests": return PersonInterests;
            case "personLanguages": return PersonLanguages;
            case "personPublications": return PersonPublications;
            case "personPatents": return PersonPatents;
            default: return null;
        }
    }
}
