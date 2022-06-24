package me.awakedev.designpatterns._02_structural_patterns._09_decorate._01_before;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {
    private CommentService commentService;

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
//        Client client = new Client(new TrimmingCommentService());
//        Client client = new Client(new TrimmingAndSpamFilteringCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
