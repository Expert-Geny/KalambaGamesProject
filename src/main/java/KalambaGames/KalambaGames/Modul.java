package KalambaGames.KalambaGames;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "action")
public class Modul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long gameId;
    private String action;

    public Modul(Long userId, Long gameId, String action) {
        this.userId = userId;
        this.gameId = gameId;
        this.action = action;
    }

    public Modul() {

    }
}


