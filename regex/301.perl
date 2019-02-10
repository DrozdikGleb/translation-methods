$answer = "";
$prevEmpty = 0;
while(my $line = <>)  {
    if (($line =~ /^\s*$/)) {
        if (!$prevEmpty) {
            $prevEmpty = 1;
        }
        next;
    } else {
        if ($prevEmpty) {
            $answer = $answer . "\n";
        }
        $prevEmpty = 0;
    }
    $line =~ s/^\s+//;
    $line =~ s/\s+/ /g;
    $line =~ s/\s+$//;
    $answer = $answer . $line . "\n";
}
$answer =~ s/^[\s\n]+//;
$answer =~ s/[\s\n]+$//;
print $answer;