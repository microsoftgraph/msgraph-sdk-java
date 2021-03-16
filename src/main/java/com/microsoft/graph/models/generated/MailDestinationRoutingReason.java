// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Mail Destination Routing Reason.
*/
public enum MailDestinationRoutingReason
{
    /**
    * none
    */
    NONE,
    /**
    * mail Flow Rule
    */
    MAIL_FLOW_RULE,
    /**
    * safe Sender
    */
    SAFE_SENDER,
    /**
    * blocked Sender
    */
    BLOCKED_SENDER,
    /**
    * advanced Spam Filtering
    */
    ADVANCED_SPAM_FILTERING,
    /**
    * domain Allow List
    */
    DOMAIN_ALLOW_LIST,
    /**
    * domain Block List
    */
    DOMAIN_BLOCK_LIST,
    /**
    * not In Address Book
    */
    NOT_IN_ADDRESS_BOOK,
    /**
    * first Time Sender
    */
    FIRST_TIME_SENDER,
    /**
    * auto Purge To Inbox
    */
    AUTO_PURGE_TO_INBOX,
    /**
    * auto Purge To Junk
    */
    AUTO_PURGE_TO_JUNK,
    /**
    * auto Purge To Deleted
    */
    AUTO_PURGE_TO_DELETED,
    /**
    * outbound
    */
    OUTBOUND,
    /**
    * not Junk
    */
    NOT_JUNK,
    /**
    * junk
    */
    JUNK,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MailDestinationRoutingReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
