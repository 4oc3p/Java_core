package homework.ui;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 * Created by 4oc3p on 21.09.2017. Java_core
 */
public class Music {

    public static void main(String[] args) {
        Music music = new Music();
        music.play();
    }

    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            ShortMessage shortMessage = new ShortMessage();
            shortMessage.setMessage(144, 1, 44, 127);
            MidiEvent event = new MidiEvent(shortMessage, 11);

            track.add(event);
            player.setSequence(sequence);
            player.start();
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

}
