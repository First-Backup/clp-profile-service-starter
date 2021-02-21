package com.corelogic.clp.starters.profile;

import com.corelogic.clp.starters.profile.dtos.IdentityProvider;
import com.corelogic.clp.starters.profile.dtos.ProfileRequest;
import com.corelogic.clp.starters.profile.dtos.ProfileResponse;

public interface ProfileClient {
    ProfileResponse getProfile(String profileId);

    ProfileResponse searchProfile(String userName, IdentityProvider identityProvider, String applicationCode);

    ProfileResponse createProfile(ProfileRequest profileRequest);

    ProfileResponse updateProfile(ProfileRequest profileRequest, String profileId) ;

    void deleteProfile(String profileId) ;
}
