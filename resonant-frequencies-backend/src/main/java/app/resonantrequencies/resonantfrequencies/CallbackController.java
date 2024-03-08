package app.resonantrequencies.resonantfrequencies;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CallbackController {

    @GetMapping("/login/oauth2/code/spotify")
    public String spotifyCallback(@AuthenticationPrincipal OAuth2User principal) {
        // Here, 'principal' contains the authenticated user's details
        // You can save the access token, make requests to Spotify API, etc.
        return "redirect:/";
    }
}