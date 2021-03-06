/**
 *
 * Copyright the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jivesoftware.smackx.omemo.listener;

import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.omemo.internal.OmemoMessageInformation;

/**
 * Listener interface that allows implementations to receive decrypted OMEMO messages.
 *
 * @author Paul Schaub
 */
public interface OmemoMessageListener<T_IdKey> {
    /**
     * Gets called, whenever an OmemoMessage has been received and was successfully decrypted.
     *
     * @param decryptedBody    Decrypted body
     * @param encryptedMessage Encrypted Message
     * @param wrappingMessage  Wrapping carbon message, in case the message was a carbon copy, else null.
     * @param omemoInformation Information about the messages encryption etc.
     */
    void onOmemoMessageReceived(String decryptedBody, Message encryptedMessage, Message wrappingMessage, OmemoMessageInformation<T_IdKey> omemoInformation);
}
