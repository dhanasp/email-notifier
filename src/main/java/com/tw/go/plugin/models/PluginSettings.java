/*
 * Copyright 2019 ThoughtWorks, Inc.
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

package com.tw.go.plugin.models;

import com.github.bdpiparva.plugin.base.annotations.Property;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PluginSettings {

    @Expose
    @SerializedName("smtp_host")
    @Property(name = "SMTP Host", required = true)
    public String smtp_host;

    @Expose
    @SerializedName("smtp_port")
    @Property(name = "SMTP Port", required = true)
    public String smtp_port;

    @Expose
    @SerializedName("is_tls")
    @Property(name = "TLS",required = true)
    public String is_tls;

    @Expose
    @SerializedName("sender_email_id")
    @Property(name = "Sender Email ID",required = true)
    public String sender_email_id;

    @Expose
    @SerializedName("smtp_username")
    @Property(name = "SMTP Username",required = true)
    public String smtp_username;

    @Expose
    @SerializedName("sender_password")
    @Property(name = "Sender Password",required = true,secure = true)
    public String sender_password;

    @Expose
    @SerializedName("receiver_email_id")
    @Property(name = "Receiver Email-id",required = true,secure = true)
    public String receiver_email_id;


    @Expose
    @SerializedName("pipeline_stage_filter")
    @Property(name = "Pipeline/Stage/Status filter")
    public String pipeline_stage_filter;




}
