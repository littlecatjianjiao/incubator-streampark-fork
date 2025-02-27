/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.streampark.console.system.service;

import org.apache.streampark.console.base.domain.RestRequest;
import org.apache.streampark.console.system.entity.Member;
import org.apache.streampark.console.system.entity.Team;
import org.apache.streampark.console.system.entity.User;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface MemberService extends IService<Member> {

  void removeByRoleIds(String[] roleIds);

  void removeByUserId(Long userId);

  void removeByTeamId(Long teamId);

  IPage<Member> getPage(Member member, RestRequest request);

  List<User> listUsersNotInTeam(Long teamId);

  List<Team> listTeamsByUserId(Long userId);

  Member getByTeamIdUserName(Long teamId, String userName);

  List<Long> listUserIdsByRoleId(Long roleId);

  void createMember(Member member);

  void remove(Member member);

  void updateMember(Member member);
}
